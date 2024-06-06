package com.example;

import java.util.List;

public interface IFeline {
    List<String> getFood(String animalKind) throws Exception;
    int getKittens();
}
