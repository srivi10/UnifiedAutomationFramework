package com.ua.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.Map;

public class WebJsonUtil {
    public static class Credentials {
        private String username;
        private String password;

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }
    }

    public static class CredentialSet {
        private Map<String, Credentials> users;

        public Map<String, Credentials> getUsers() {
            return users;
        }
    }

    public CredentialSet readCredentialSet(String filePath) {
        try (InputStreamReader reader = new InputStreamReader(
                getClass().getClassLoader().getResourceAsStream(filePath))) {
            Type credentialSetType = new TypeToken<CredentialSet>() {}.getType();
            return new Gson().fromJson(reader, credentialSetType);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
