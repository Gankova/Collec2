package com.company;

public class User {
    private int id;
    public User(int id) {
        this.id = id;

    }
    @Override
    public boolean equals (Object o){
        User u = (User) o;
        return u.id == this.id;

    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public String toString(){
        return String.format("User ID : %d", this.id);
    }

}
