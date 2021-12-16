package domain.strategy.implementations;

import domain.strategy.abstractions.Strategy;

public class StudentCard implements Strategy {
    @Override
    public double doSale(double price){
        return price *0.85;
    }
}
