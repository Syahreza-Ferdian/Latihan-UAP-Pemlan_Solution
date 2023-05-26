class Helper {
    // Helper function to initialize variable that used in runtime environment
    static void initialize(){

        // Code Here
        // P.S: I think something is wrong with Initialize function

        // Initilaize Admin Instances
        Main.admins[0] = new Admin("joko", "ini_password_joko");
        Main.admins[1] = new Admin("dengklek", "ini_password_dengklek");

        // Initialize Hewan Instances
        Main.ayam = new Ayam(500, 1000, 3, 3000, 20000);
        Main.domba = new Domba(100, 10000, 2.5, 10000, 1000000);
        Main.sapi = new Sapi(50, 80000, 7.5, 25000, 2500000);

        // Initialize Tanaman Instances
        Main.cengkeh = new Cengkeh(50, 100000, 10, 30000, 15000000);
        Main.kepalaSawit = new KepalaSawit(40, 200000, 25, 25000, 20000000);

        // Initialize Medicine instances
        Main.boosterAyam = new Medicine("Obat Booster Ayam", 3000, 7);
        Main.boosterSapi = new Medicine("Obat Booster Sapi", 50000, 5);
        Main.pesticideCengkeh = new Medicine("Pestisida Cengkeh", 500000, 14);
        Main.boosterKepalaSawit = new Medicine("Pupuk Booster Kepala Sawit", 1000000, 10);

        // Uang Kas 100000000
        Main.cash = 100000000;
    }

    // Helper function to authentication
    // PS: Doing an iteration to check one by one admin instances
    static boolean authentication(String username, String password) {
        boolean afkhCocok = false;
        for(int i = 0; i < Main.admins.length; i++){
            if(Main.admins[i].isMatch(username, password)){
                afkhCocok = true;
                break;
            }
        }
        return afkhCocok;
    }

    // PS: You can add new helper function below this comment if you want
    static String nameCapitalize(String name){
        char firstLetter = name.toUpperCase().charAt(0);
        String correction = String.valueOf(firstLetter) + name.substring(1, name.length());
        return correction;
    }
}