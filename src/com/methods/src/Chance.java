package com.methods.src;

/**
 * Created with IntelliJ IDEA.
 * User: emily
 * Date: 6/13/13
 * Time: 2:08 AM
 * To change this template use File | Settings | File Templates.
 */
public class Chance {
    private final double probability;

    public Chance(double probability) {
        this.probability = probability;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }else{
            if(obj == null){
                return false;
            }else {
                if ((obj.getClass().equals(getClass()))){
                    if (this.probability == ((Chance)obj).probability){
                        return true;
                    }else {
                        return false;
                    }
                }
            }
        }
        return false;
    }
}
