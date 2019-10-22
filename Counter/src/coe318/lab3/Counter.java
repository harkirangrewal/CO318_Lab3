/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab3;

/**
 *
 * @author h36grewa
 */
public class Counter {
    public int modulus;
    Counter left;
    public int digit;
    public int increment;
    

    public Counter(int modulus, Counter left) {
        this.modulus = modulus;
        this.left = left;   
        this.digit = 0;
        this.increment = 0;
    }


    /**
     * @return the modulus
     */
    public int getModulus() {
        return this.modulus;
    }

    /**
     * Returns the Counter to the left attached to this
     * Counter.  Returns null if there is no Counter
     * to the left.
     * @return the left
     */
    public Counter getLeft() {
        
        if(this.left == null)
        {
         return null;   
        }
        
        else
        {
            return this.left;
        }
    }

    /**
     * @return the digit
     */
    public int getDigit() {
        return this.digit;
    }

    /**
     * @param digit the digit to set
     */
    public void setDigit(int digit) {
        this.digit = digit;
    }

    /**
     * Increment this counter.  If it rolls over,
     * its left Counter is also incremented if it
     * exists.
     */
    public void increment() {
        this.digit ++;
        if(this.digit == this.modulus)
        {
            this.digit=0;
            if(left != null)
            {
                left.increment();
            }
        }

    }

    /** Return the count of this Counter combined
     * with any Counter to its left.
     *
     * @return the count
     */
    public int getCount() {
        if (this.left== null)
        {
            return this.digit;
        }
        else
        {
            int count=0;
            count = this.digit + (this.modulus*left.getCount());
            return count;
        }
    }

    /** Returns a String representation of the Counter's
     * total count (including its left neighbour).
     * @return the String representation
     */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }
}


    
