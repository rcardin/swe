package it.unipd.math.swe.patterns.singleton;


import it.unipd.math.swe.patterns.strategy.User;

public enum UserRepository {
    INSTANCE;

    public User findUser(String username) {
        return null;
    }
}
