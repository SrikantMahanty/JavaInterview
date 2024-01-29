public class StringBuilder_Buffer {
    public static void main(String[] args) {

        //notthreadSafe
//        StringBuilder sb=new StringBuilder();
        StringBuffer sb=new StringBuffer();
            //threadsafe
        Thread th=new Thread(()->{
            for(int i=0;i<1000;i++){
                sb.append('A');
            }

        });
        Thread th2=new Thread(()->{
            for(int i=0;i<1000;i++){
                sb.append('i');
            }

        });
        th.start();
        th2.start();
        try{
            th.join();
            th2.join();

        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(sb.toString().length());

    }
}
