package OOP.HW.HW_5;

public class Main {

  public static void main(String[] args) {

    WorkerFactory worker = new WorkerFactory();

    Worker builder = worker.getWorker(WorkerTypes.BUILDER);
    Worker cook = worker.getWorker(WorkerTypes.COOK);
    Worker driver = worker.getWorker(WorkerTypes.DRIVER);

    builder.searchWorker();
    builder.drawUpWorker();
    cook.searchWorker();
    cook.drawUpWorker();
    driver.searchWorker();
    driver.drawUpWorker();


  }
}
