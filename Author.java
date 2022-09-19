package ru.mirea.kvbo1.gurtovaya;

public class Author {
        private String name, email;
        private char gender;

        public Author(String name, String email, char gender) {
            this.name = name;
            this.email = email;
            if(gender != 'М' && gender != 'Ж');
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public char getGender() {
            return gender;
        }

        public String toString() {
            return "Данные человека: " + "Имя = " + name + "; Почта = " + email + "; Гендер = " + gender + ".";
        }
    }
