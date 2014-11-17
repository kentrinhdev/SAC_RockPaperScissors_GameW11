
class ToString 
{  
    private int win, lose;
 
    public ToString( int win, int lose ) 
    {
        this.win = win;
        this.lose = lose;
    }
    
    // Returns the string representation of this Complex number.
    // The format of string is "Re + iIm" where Re is real part
    // 	and Im is imagenary part.
    @Override
    public String toString() 
    {
    	return String.format(win + " = Win, Lose = " + lose + "\n");
    }
 
} // end class ToString
