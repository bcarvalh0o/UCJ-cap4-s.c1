class xcopy {

    int go(int arg){
        arg = arg * 2;
        return arg;
    }
    public static void main(String[] args) {
        int orig = 42;

xcopy One = new xcopy();
   
int y = One.go(orig);
    

        System.out.println( orig + "" + y);

}

}