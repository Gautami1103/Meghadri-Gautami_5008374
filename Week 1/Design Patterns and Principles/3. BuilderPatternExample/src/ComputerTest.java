public class ComputerTest
{
    public static void main(String[] args)
    {
        Computer c1=new Computer.Builder()
                .setCompany("Lenovo")
                .setCPU("Intel i5")
                .setMotherboard("Intel")
                .setRAM("64 GB")
                .setStorage("512 SSD")
                .build();

        Computer c2=new Computer.Builder()
                .setCompany("HP")
                .setCPU("Ryzen 5")
                .setMotherboard("Ryzen")
                .setRAM("32s GB")
                .setStorage("512 SSD")
                .build();

        System.out.println(c1);
        System.out.println(c2);
    }
}