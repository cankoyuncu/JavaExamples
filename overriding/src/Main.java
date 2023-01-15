public class Main {
    public static void main(String[] args) {

//        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
//        System.out.println(ogretmenKrediManager.calculate(3400));

        BaseKrediManager[] krediManagers = new BaseKrediManager[]
                {new OgretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager()};
        for (BaseKrediManager krediManager : krediManagers){
            System.out.println(krediManager.calculate(1000));
        }
    }
}