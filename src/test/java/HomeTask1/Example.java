package HomeTask1;

class Example  {

    public static void main(String[] args) {
       Runnable obj=new Runnable() {
           @Override
           public void run() {
               for(int i=0;i<5;i++)
               {
                   System.out.println("Without Lambda Expression:"+i);
               }
           }
       };

    Thread t=new Thread(obj);

    Thread t1=new Thread(()->{
            for(int i=0;i<5;i++)
            {
                System.out.println("With Lambda Expression:"+i);
            }});

    t.start();
    try{Thread.sleep(10);}catch(Exception e){}
    t1.start();

    }
}

