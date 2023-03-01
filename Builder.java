package OOP.HW.HW_5;

public class Builder implements Worker{

  @Override
  public void searchWorker() {
    //находим работника
    System.out.println("Подбираем строителя...");
  }

  @Override
  public void drawUpWorker() {
    //оформляем работника
    System.out.println("Проверяем документы высотника\n"
        + "Подбираем жилье\n"
        + "Оформляем строителя...");
  }

}
