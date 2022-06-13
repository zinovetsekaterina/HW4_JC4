package ru.geekbrains.lesson4;

import java.util.*;

public class Name {
        public static void main(String[] args) {
                String[] words = {"Sasha", "Masha", "Sasha", "Katya", "Sonya", "Sasha", "Tanya", "Tolya"};


                Map<String, Integer> map = new HashMap<>();
                for (String word : words) {
                        map.put(word, map.getOrDefault(word, 0) + 1);
                }
                System.out.println(map);
                System.out.println("");

                Set<String> uniq = new HashSet<>(Arrays.asList(words));
                System.out.println(uniq);
                System.out.println("");
        }

//Телефонный справочник
                        private static HashMap<String, String> phonebook = new HashMap<String, String>();

                        private static void addPhonebook(String phone, String name) {
                                phonebook.put(phone, name);
                                System.out.println(phonebook.get(name));
                        }
                }

