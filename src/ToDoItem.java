public class ToDoItem {
    private  String descrption;
    private boolean isDone;


    public ToDoItem(String descrption){
        this.descrption = descrption;
        this.isDone = false;
    }

    public void setDescrption(String dsc) {
        this.descrption = dsc;
    }

    public String getDescrption() {
        return this.descrption;
    }

    public void setIsDone(boolean isDone) {
        this.isDone = isDone;
    }

    public boolean getIsDone(){
        return this.isDone;
    }

}
