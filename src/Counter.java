public class Counter implements Runnable{
    private String name;
    private int id;

    public boolean isRun = true;
    public Counter(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void run() {
        int i = 1;
        while (isRun){
                System.out.println(this.getName()+" : "+i);
                i++;
                try{
                    Thread.sleep(1000L*id);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public  void stop(){
        this.isRun=false;
    }
}
