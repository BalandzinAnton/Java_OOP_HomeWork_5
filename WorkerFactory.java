package OOP.HW.HW_5;

public class WorkerFactory {

  public Worker getWorker(WorkerTypes type) {
    Worker toReturn = null;

    switch (type) {
      case BUILDER:
        toReturn = new Builder();
        break;
      case COOK:
        toReturn = new Cook();
        break;
      case DRIVER:
        toReturn = new Driver();
        break;
      default:
        throw new IllegalArgumentException("Wrong worker type:" + type);
    }
    return toReturn;
  }

}
