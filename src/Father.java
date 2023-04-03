 class Father {
    public static void main (String args[]) throws Exception

    {
       System.out.println("I am the Father of Sheela and dinga") ;

        Sheela ch1 = new Sheela();
        ch1.chield1();

        Thread.sleep(2000);
        System.out.println("Dinga Deatails processing.............");
        Thread.sleep(2000);

        Dinga ch2 = new Dinga();
        ch2.chield2();
    }
 }