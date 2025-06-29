import java.util.Date;
import java.util.Scanner;

public class evcplus22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("fadlan geli *770#");
        String Dailup = input.next();
        String dail = "*770#";
        int pass = 1234;
        double balance = 1000;


        int bill = 9999;
        int Tell_num = 618894769;
        if (Dailup.equals(dail)) {//Iridka Evcplus *770#
            System.out.println("-EVCPLUS");
            System.out.println("Fadlan geli PIN-kaaga (Enter PIN)");
            int user_pass = input.nextInt();
            if (pass == user_pass) {
                System.out.println("1.Itus Haaraaga");
                System.out.println("2.Kaarka hadalka");
                System.out.println("3.Bixi biil");
                System.out.println("4.U wareeji EVCPLUS");
                System.out.println("5.Warbixin Kooban");
                System.out.println("6.Salaam Bank");
                System.out.println("7.Maareynta");
                System.out.println("8.TAAJ");
                //opption one
                int dooro = input.nextInt();

                switch (dooro) {//bilowga dorashoyinka Guud
                    case 1://1.Itus Haraaga
                        System.out.println("{-EvcPlus-} Haaraagagu waa $" + balance);
                        break;
                    case 2:
                        System.out.println("1.Ku Shubo Airtime");
                        System.out.println("2.ugu Shub Airtime");
                        System.out.println("3.MIFI Packages");
                        System.out.println("4.Ku Shubo Internet");
                        System.out.println("5.ugu Shub qof kale (MMT)");

                        int Ku_hadal = input.nextInt();
                        switch (Ku_hadal) {// Bilowga  doorashoyinka 2.Kaarka hadalka
                            case 1://1.Ku Shubo Airtime
                                System.out.println("Fadlan geli Lacagta ");
                                int lacag = input.nextInt();
                                System.out.println("mahubta inaad ");
                                System.out.println("$" + lacag + " ugu shubtid undefined? \n1: Haa\n2: Maya");

                                int yeelid = input.nextInt();
                                if (yeelid == 1) {
                                    if (balance > lacag) {
                                        System.out.println("waxa ku shubay $" + lacag + "haraagagu waa:" + (balance - lacag));
                                    } else if (balance < lacag) {
                                        System.out.println("Haraaga xisaabtaadu kuguma filnna,");
                                    }

                                } else System.out.println("Mahadsanid");
                                break;
                            case 2://2.ugu Shub Airtime
                                System.out.println("Fadlan geli mobile kaaga");
                                int mobile = input.nextInt();
                                System.out.println("Fadlan geli lacagta");
                                int lacag2 = input.nextInt();
                                System.out.println("ma hubta inaad $" + lacag2 + " ugu shubtid" + mobile + "? \n1: Haa\n2: Maya");
                                int shubasho = input.nextInt();
                                if (shubasho == 1) {
                                    if (balance > lacag2) {
                                        System.out.println("waxad ku gulesatay $" + lacag2 + "ugu shubtay " + mobile + "Haaraagaagu waa" + (balance - lacag2));
                                    } else if (balance < lacag2) {
                                        System.out.println("Haaraaga xisaabtaadu kuguma filna, mobile No:" + mobile);
                                    }
                                } else System.out.println("Mahadsanid");
                                break;
                            case 3://"3.MIFI Packages"
                                System.out.println("EVCPlus");
                                System.out.println("1.Ku shubo data_da MIFI");
                                int gaal = input.nextInt();
                                switch (gaal) {//galida 1.Ku shubo data_da MIF
                                    case 1:
                                        System.out.println("--Itenet Rundle Recharge--");
                                        System.out.println("1.Isbuucle (Weekly)\n2.Maalinle(Daily)\n3.Bille(Mifi)");
                                        break;
                                    default:
                                        System.out.println("unkown");
                                }
                                int Bundle = input.nextInt();
                                switch (Bundle) {  //bilowga dooroshoyinka 3.MIFI Packages


                                    case 1://1.Isbuucle (Weekly)
                                        System.out.println("Fadlan dooro bundle ka");
                                        System.out.println("1.$5 =10 GB");
                                        System.out.println("2.$10 = 25 GB");
                                        int shubasho1 = input.nextInt();
                                        if (shubasho1 == 1) {
                                            System.out.println("Fadlan Gali MIFI user");
                                            int Mifi = input.nextInt();
                                            System.out.println("ma hubta inaa $" + 5 + " ugu shubaysid " + Mifi + "?");
                                            System.out.println("1Haa\n2.Maya");
                                            int mifi = input.nextInt();
                                            if (mifi == 1) {
                                                if (balance >= 5) {
                                                    System.out.println("waxad $" + 5 + " ugushubtay " + Mifi + "haraagagu waa: " + (balance - 5));
                                                } else
                                                    System.out.println("Haraaga xisaabtafu kuguma filna mobile No:" + Mifi);

                                            } else System.out.println("mahadsanid");

                                        }//End of "1.$5 =10 GB"
                                        if (shubasho1 == 2) {
                                            System.out.println("Fadlan Gali MIFI user");
                                            int Mifi = input.nextInt();
                                            System.out.println("ma hubta inaa $" + 10 + " ugu shubaysid" + Mifi + "?");
                                            System.out.println("1Haa\n2.Maya");
                                            int mifi = input.nextInt();
                                            if (mifi == 1) {
                                                if (balance >= 10) {
                                                    System.out.println("waxad $" + 10 + " ugushubtay " + Mifi + " haraagagu waa: " + (balance - 10));
                                                } else
                                                    System.out.println("Haraaga xisaabtafu kuguma filna mobile No:" + Mifi);

                                            } else System.out.println("mahadsanid");

                                        } //end of weakly "2.$10 = 25 GB"
                                        break;
                                    case 2://2.Maalinle(Daily)

                                        System.out.println("Fadlan dooro bundle ka");
                                        System.out.println("1.$1 = 2 GB");
                                        System.out.println("2.$2 = 5 GB");
                                        int shubasho2 = input.nextInt();
                                        if (shubasho2 == 1) {
                                            System.out.println("Fadlan Gali MIFI user");
                                            int Mifi = input.nextInt();
                                            System.out.println("ma hubta inaa $" + 1 + "ugu shubaysid" + Mifi + "?");
                                            System.out.println("1Haa\n2.Maya");
                                            int mifi = input.nextInt();
                                            if (mifi == 1) {
                                                if (balance >= 1) {

                                                    System.out.println("waxad $" + 1 + " ugushubtay " + Mifi + "haraagagu waa: " + (balance - 1));
                                                } else
                                                    System.out.println("Haraaga xisaabtafu kuguma filna mobile No:" + Mifi);

                                            } else System.out.println("mahadsanid");

                                        }//end 1.$1=2gb

                                        if (shubasho2 == 2) {
                                            System.out.println("Fadlan Gali MIFI user");
                                            int Mifi = input.nextInt();
                                            System.out.println("ma hubta inaa $" + 2 + " ugu shubaysid" + Mifi + "?");
                                            System.out.println("1Haa\n2.Maya");
                                            int mifi = input.nextInt();
                                            if (mifi == 1) {
                                                if (balance >= 2) {
                                                    System.out.println("waxad $" + 2 + " ugushubtay " + Mifi + "haraagagu waa: " + (balance - 2));
                                                } else
                                                    System.out.println("Haraaga xisaabtafu kuguma filna mobile No:" + Mifi);

                                            } else System.out.println("mahadsanid");

                                        }//End of 2. $2=5 gb
                                        break;

                                    case 3://3.Bille(Mifi)

                                        System.out.println("Fadlan dooro bundle ka");
                                        System.out.println("1.$20 = 40 GB");
                                        System.out.println("2.$40 = 85 GB");
                                        System.out.println("3.$60 = 150 GB");
                                        System.out.println("4.$30 = Monthly Unlimit");
                                        int shubasho3 = input.nextInt();
                                        if (shubasho3 == 1) {
                                            System.out.println("Fadlan Gali MIFI user");
                                            int Mifi = input.nextInt();
                                            System.out.println("ma hubta inaa $" + 20 + "ugu shubaysid" + Mifi + "?");
                                            System.out.println("1Haa\n2.Maya");
                                            int mifi = input.nextInt();
                                            if (mifi == 1) {
                                                if (balance >= 20) {

                                                    System.out.println("waxad $" + 20 + " ugushubtay " + Mifi + "haraagagu waa: " + (balance - 20));
                                                } else
                                                    System.out.println("Haraaga xisaabtafu kuguma filna mobile No:" + Mifi);
                                            } else System.out.println("mahadsanid");

                                        }//end 1.$20 = 40 GB

                                        if (shubasho3 == 2) {
                                            System.out.println("Fadlan Gali MIFI user");
                                            int Mifi = input.nextInt();
                                            System.out.println("ma hubta inaa $" + 40 + " ugu shubaysid" + Mifi + "?");
                                            System.out.println("1Haa\n2.Maya");
                                            int mifi = input.nextInt();
                                            if (mifi == 1) {
                                                if (balance >= 40) {

                                                    System.out.println("waxad $" + 40 + " ugu shubtay " + Mifi + "haraagagu waa: " + (balance - 20));
                                                } else
                                                    System.out.println("Haraaga xisaabtafu ku guma filna mobile No:" + Mifi);

                                            } else System.out.println("mahadsanid");

                                        }//end 2.$40 = 85 GB

                                        if (shubasho3 == 3) {
                                            System.out.println("Fadlan Gali MIFI user");
                                            int Mifi = input.nextInt();
                                            System.out.println("ma hubta inaa $" + 60 + " ugu shubaysid " + Mifi + "?");
                                            System.out.println("1Haa\n2.Maya");
                                            int mifi = input.nextInt();
                                            if (mifi == 1) {
                                                if (balance >= 60) {

                                                    System.out.println("waxad $" + 60 + " ugushubtay " + Mifi + "haraagagu waa: " + (balance - 60));
                                                } else
                                                    System.out.println("Haraaga xisaabtafu kuguma filna mobile No:" + Mifi);

                                            } else System.out.println("mahadsanid");

                                        }//end 3.$60 = 150 GB 4.$30 = Monthly Unlimit


                                        if (shubasho3 == 4) {
                                            System.out.println("Fadlan Gali MIFI user");
                                            int Mifi = input.nextInt();
                                            System.out.println("ma hubta inaa $" + 30 + " ugu shubaysid" + Mifi + "?");
                                            System.out.println("1Haa\n2.Maya");
                                            int mifi = input.nextInt();
                                            if (mifi == 1) {
                                                if (balance >= 30) {

                                                    System.out.println("waxad $" + 30 + " ugushubtay " + Mifi + "haraagagu waa: " + (balance - 30));
                                                } else
                                                    System.out.println("Haraaga xisaabtafu kuguma filna mobile No:" + Mifi);

                                            } else System.out.println("mahadsanid");

                                        }//end4.$30 = Monthly Unlimit
                                        break;

                                    default:
                                        System.out.println("unkown");
                                }//dhamadka dooroshoyinka 3.MIFI Packages
                                break;

                            case 4: //4.Ku Shubo Internet
                                System.out.println("Fadlan dooro Number-ka ku shubeyso");
                                System.out.println("1. Isbucle(weekly)\n2.TIME BASED PACKAGES");
                                System.out.println("3.DATA \n4.Maalinle(Daily)\n5.Bille(Mifi)");
                                int Shubo_Internet = input.nextInt();
                                switch (Shubo_Internet) { // doorashoyinka 4.Ku Shubo Internet
                                    case 1://1. Isbucle(weekly)
                                        System.out.println("Fadlan Geli lacagta");
                                        int lcg = input.nextInt();
                                        System.out.println("ma hubta inaa $" + lcg + " ugu shubaysid ?");
                                        System.out.println("1Haa\n2.Maya");
                                        int Internet = input.nextInt();
                                        if (Internet == 1) {
                                            System.out.println("waxa ku shubatay $" + lcg + "  haraagagu waa:" + (balance - lcg));
                                        } else System.out.println("Mahadsanid");
                                        break;
                                    case 2://2.TIME BASED PACKAGES
                                        System.out.println("Fadlan Geli lacagta");
                                        int lacagta = input.nextInt();
                                        System.out.println("Mahubta inaa $" + lacagta + " ku shubatid? \n1.Haa \n2.Maya");
                                        int TIME_BASED = input.nextInt();
                                        if (TIME_BASED == 1) {
                                            System.out.println("waxa ku shubatay $" + lacagta + "   haraagagu waa:" + (balance - lacagta));
                                        } else System.out.println("mahadsanid");
                                        break;
                                    case 3://3.DATA
                                        System.out.println("Fadlan Geli lacagta");
                                        int lacagta1 = input.nextInt();
                                        System.out.println("Mahubta inaa $" + lacagta1 + " ku shubatid? \n1.Haa \n2.Maya");
                                        int DATA = input.nextInt();
                                        if (DATA == 1) {
                                            System.out.println("waxa ku shubatay $" + lacagta1 + "  haraagagu waa:" + (balance - lacagta1));
                                        } else System.out.println("Mahadsanid");
                                        break;
                                    case 4://4.Maalinle(Daily)
                                        System.out.println("Fadlan ali Lacagta");
                                        int lcgta = input.nextInt();
                                        System.out.println("Mahubta inaa $" + lcgta + " ku shubatid? \n1.Haa \n2.Maya");
                                        int Daily = input.nextInt();
                                        if (Daily == 1) {
                                            System.out.println("waxa ku shubatay $" + lcgta + "  haraagagu waa:" + (balance - lcgta));
                                        } else System.out.println("Mahadsanid");
                                        break;
                                    case 5://5.Bille(Mifi)
                                        System.out.println("Fadlan ali Lacagta");
                                        int lacagta3 = input.nextInt();
                                        System.out.println("Mahubta inaa $" + lacagta3 + " ku shubatid? \n1.Haa \n2.Maya");
                                        int Bille = input.nextInt();
                                        if (Bille == 1) {
                                            System.out.println("waxa ku shubatay $" + lacagta3 + "  haraagagu waa:" + (balance - lacagta3));
                                        } else System.out.println("Mahadsanid")
                                                ;
                                        break;
                                }//dhamadka doroshoyinka 4.Ku Shubo Internet
                            case 5://5.ugu Shub qof kale (MMT)
                                System.out.println("Fadlan gali mobile_ka");
                                int mobile_ka = input.nextInt();
                                System.out.println("Fadlan geli lacagta");
                                int mon = input.nextInt();
                                System.out.println("Ma hubtaa inaad $" + mon + " ugu shubtid " + mobile_ka + "\n1.Haa\n2.Maya");
                                int hubsasho = input.nextInt();
                                if (hubsasho == 1) {
                                    System.out.println("waxaad $" + mon + " ugu shubatay " + mobile_ka + ", haraagagu waa:" + (balance - mon));
                                } else System.out.println("Mahadsanid");
                                break;
                            // default:
                            // System.out.println("unkown");
                        }//Dhamadka doorashoyinka 2.Kaarka hadalka
                        break;
                    case 3://3.Bixi biil
                        System.out.println("Bixi Biil");
                        System.out.println("1Post paid");
                        System.out.println("2.Ku iibso");
                        int Bixi_biil = input.nextInt();
                        switch (Bixi_biil) {
                            case 1://1Post paid
                                System.out.println("Post paid");
                                System.out.println("1.ogow Biilka.");
                                System.out.println("2.Bixi Biil.");
                                System.out.println("3.Ka Bixi Biil");
                                int paid = input.nextInt();
                                switch (paid) {//tixaha Post paid
                                    case 1://1.ogow Biilka
                                        System.out.println("error occurred please try again later");
                                        break;
                                    case 2://2.Bixi Biil
                                        System.out.println("fadlan gali lacagta");
                                        int mone = input.nextInt();
                                        System.out.println("Ma hubtaa inaad bixisid bill lacagtisu tahay $" + mone + "?\n1.Haa\nMaya");
                                        dooro = input.nextInt();
                                        if (dooro == 1) {
                                            double total;
                                            total = bill - mone;
                                            System.out.println("waad ku guuleystay inaa bixiso biilka \n" + "Haraagaagu waa " + (bill - mone));

                                        } else System.out.println("Mahadsanid!");
                                }//End post paid
                                break;
                            case 2://2.Ku libs
                                System.out.println("Fadlan Geli aqoonsiga ganacsiga");
                                double aqoonsi = input.nextDouble();
                                if (aqoonsi == aqoonsi) {
                                    System.out.println("Fadlan Gali Number ka");
                                    int number = input.nextInt();
                                    System.out.println("Fadlan Gali lacagta");

                                    long money1 = input.nextLong();
                                    if (money1 <= bill) {
                                        System.out.println("Ma hubtaa inaad " + money1 + " udirto " + number + "\n" + "1.haa\n" + "2.maya");
                                        dooro = input.nextInt();
                                        if (dooro == 1) {
                                            double total;
                                            total = bill - money1;
                                            System.out.println("waad ku guuleystay howshaan\n" + "Haraagaagu waa " + total);

                                        } else System.out.println("Mahadsanid!");

                                    }
                                } else
                                    System.out.println("aqoonsigaaga waa qalad");
                                break;
                            default:
                                System.out.println("dhamad");
                                break;
                        }
                        break;
                    case 4://U wareeji EVCPLUS
                        System.out.println("Fadlan geli mobile_ka");
                        int mobile_ka1 = input.nextInt();
                        System.out.println("Fadlan geli lacagta");
                        int mon2 = input.nextInt();
                        System.out.println("Mahubta inaad $" + mon2 + "u wareejisid " + mobile_ka1 + "?\n1.Haa\n2.Maya ");
                        int wareejin = input.nextInt();
                        Date date = new Date();
                        if (wareejin == 1) {
                            if (mobile_ka1 != Tell_num) {
                                // System.out.println("waa isku mid");

                                if (balance >= mon2) {
                                    System.out.println("[-EVCPlus-]\n $" + mon2 + " Ayaad u weerejisay " + mobile_ka1 + "\nTar:" + date + " Haraagaagu waa:" + (balance - mon2));
                                    System.out.println("La soo deg App-ka WAAFI http://onelink.to/waafi ");
                                } else if (balance <= mon2) {
                                    System.out.println("Haraaaga xisabta kuguma filna, mobile No: " + mobile_ka1);
                                }
                            } else
                                System.out.println("Diraha iyo loo diraha isku mid ma noqon karaan");
                        } else System.out.println("mahadsanid");
                        break;
                    case 5: //5.Warbixin Kooban
                        System.out.println("warbixin kooban");
                        System.out.println("1.Last Action \n2.wareejinti u dambsay\n3.Iibsashadii u dambeysay");
                        System.out.println("4.Lact 3 Action \n5.Email me My Activity");
                        int Action = input.nextInt();
                        switch (Action) {//warbixin kooban
                            case 1://1.Last Action
                                System.out.println("[-EVCPlus-]\n Waxaad $20 ugu shubtay 252615000081");
                            case 2://2.wareejinti u dambsay
                                System.out.println("statementiga :");
                                System.out.println("1.Udirtay");
                                System.out.println("2.Ka heshay");
                                int dambsay = input.nextInt();
                                switch (dambsay) { //options of 2.wareejinti u dambsay
                                    case 1://1.Udirtay
                                        System.out.println("Fadlan geli mobile-ka");
                                        int phone = input.nextInt();
                                        System.out.println("Fadlan geli Lacagta");
                                        int mon3 = input.nextInt();
                                        if (phone == phone) {
                                            System.out.println("operation succeeded No Transactions to display!");
                                        }
                                        break;
                                    case 2://2.Ka heshay
                                        System.out.println("Fadlan geli mobile-ka");
                                        int phone1 = input.nextInt();
                                        System.out.println("Fadlan geli Lacagta");
                                        int mon4 = input.nextInt();
                                        Date date1 = new Date();
                                        System.out.println("your mini statement has been sent as SMS to your registered mobile no");
                                        if (phone1 == phone1) {
                                            System.out.println("$10 ayaad ka heshay " + phone1 + "Taarikhda " + date1 + "");
                                        } else System.out.println("sorry");
                                        break;
                                }// End //options of 2.wareejinti u dambsa
                            case 3:
                                System.out.println("Fadlan geli aqonsiga ganacsiga");
                                int aqonsiga = input.nextInt();
                                System.out.println("operation Succceded No Transactions to display!");
                                break;
                            case 4://Lact 3 Action
                                System.out.println("your mini statement has been sent as sms to your registered mobile no");
                                break;
                            case 5://Email me My Activity
                                System.out.println("Fadlan geli email kaaga");
                                String Gmail = input.next();
                                System.out.println("Fadlan gali Taarikhda hore  (maalin/bisha/sanadka) eg 1/4/2017");
                                int Date = input.nextInt();
                                if (Gmail == Gmail) {

                                    if (Gmail == Gmail) {
                                        System.out.println("you request is been processed and the activity will be emailed to " + Gmail + "" + Date);
                                    }
                                }
                        } //dhamadka warbixin kooban
                    case 6://SALAAM BANK
                        System.out.println("Salam Bank");
                        System.out.println("1.Itus Haraaga\n2.Lacag dhigasho");
                        System.out.println("3.Lacag qaadasho\n4.ka wareeji EVCPlus");
                        System.out.println("5.Ka wareeji Account_kaga\n6. Hubi wareejin account");
                        System.out.println("7.maareynta Bankiga\n8.kala bax");
                        int Salam_Bank = input.nextInt();
                        switch (Salam_Bank) {// bolowga doorashoyinka bangiga
                            case 1://1.Itus Haraaga slam bank
                                System.out.println("Fadlan geli Numberkaaga sirta ee bankiga");
                                int sirta = input.nextInt();
                                int Accoutn = 300070007;
                                System.out.println("Koontadaada Bangiga:" + Accoutn + "Haraageedu waa:" + balance);
                                break;
                            case 2: //2.Lacag dhigasho
                                System.out.println("fadlan geli lacagta");
                                int mon1 = input.nextInt();
                                System.out.println("fadlangeli macluumadka");
                                String macluumadka = input.next();
                                System.out.println("Fadlan geli Numberkaaga sirta ee bankiga");
                                int Numberka_sirta = input.nextInt();
                                int numsireed = 12345679;
                                System.out.println("ma hubtaa inaad $" + mon1 + "Account-kaaga bangiga? \n1.Haa\n2.Maya");
                                int hubin = input.nextInt();
                                if (numsireed == Numberka_sirta) {
                                    if (hubin == 1) {
                                        System.out.println("waxaad $" + mon1 + "ku shubatey bank account_kaaga: Haraagaaga waa" + balance);
                                    } else System.out.println("mahad sanid");
                                } else System.out.println("waa qalad pinkaaga lacag dhigashada");
                                break;
                            case 3://3.Lacag qaadasho
                                System.out.println("Fadlan geli lacagta");
                                int mon3 = input.nextInt();
                                System.out.println("fadlan geli macluumadka");
                                String macluumadka1 = input.next();
                                System.out.println("Fadlan geli Numberkaaga sirta ee bankiga");
                                int Numberkaga_sirta = input.nextInt();
                                int numbersiredka = 123465;
                                System.out.println("ma hubtaa inaad $" + mon3 + "Account-kaaga bangiga? \n1.Haa\n2.Maya");
                                int qaadasho = input.nextInt();
                                if (numbersiredka == Numberkaga_sirta) {
                                    if (qaadasho == 1) {
                                        System.out.println("waxaad kala baxday $" + mon3 + " xisaabtaada bangiga : Haraagaaga waa" + balance);
                                    } else System.out.println("mahad sanid");
                                } else System.out.println("waa qalad pinkaaga lacag qaadashada");
                                break;
                            case 4://4.ka wareeji EVCPlus

                                System.out.println("Fadlan dooro xisaabta Bangiga");
                                System.out.println("1.Salam Somali Bank");
                                System.out.println("2.Darasalaam Bank");
                                System.out.println("3.Bank Beeraha");
                                System.out.println("4.Salaam Sch");
                                int Tixda_Bank = input.nextInt();
                                switch (Tixda_Bank) {//(4.ka wareeji EVCPlus )Tixda xisaabta Bank Salam_Bank
                                    case 1:
                                        System.out.println("Fadlan gali Account_ka");
                                        int Account_ka = input.nextInt();
                                        System.out.println("Fadlan  geli macluumaad");
                                        String macluumaad = input.next();
                                        System.out.println("Fadlan geli lacagta");
                                        int mon4 = input.nextInt();
                                        System.out.println("Fadlan geli Numberkaaga sirta ee bankiga");
                                        int Numberkaga = input.nextInt();
                                        int num_user = 123465;
                                        if (num_user == Numberkaga) {
                                            System.out.println("ma hubtaa inaad $" + mon4 + " u wareejiso Bank Account " + Account_ka + "? \n1.Haa\n2.Maya");
                                            int Bixin = input.nextInt();

                                            if (Bixin == 1) {
                                                System.out.println("$" + mon4 + "Ayaa u wareejisay " + Account_ka + "" + (balance - mon4));
                                            }
                                        }
                                        System.out.println("Pinkaaga bankiga Waa Khalad");
                                        break;
                                    case 2://Darasalaam Bank
                                        System.out.println("Fadlan gali Account_ka");
                                        int account = input.nextInt();
                                        System.out.println("Fadlan  geli macluumaad");
                                        String macluumaad1 = input.next();
                                        System.out.println("Fadlan geli lacagta");
                                        int mon5 = input.nextInt();
                                        System.out.println("Fadlan geli Numberkaaga sirta ee bankiga");
                                        int Numkaga = input.nextInt();
                                        int num1_user = 123465;
                                        if (num1_user == Numkaga) {
                                            System.out.println("ma hubtaa inaad $" + mon5 + " u wareejiso Bank Account " + account + "? \n1.Haa\n2.Maya");
                                            int Darasalaam = input.nextInt();
                                            if (Darasalaam == 1) {
                                                System.out.println("$" + mon5 + " Ayaa u wareejisay " + account + "" + (balance - mon5));
                                            } else
                                                System.out.println("Waad Ku guuleesatay inaad iska joojiso adeegaan");
                                        } else System.out.println("Pinkaaga bankiga Waa Khalad");
                                        break;
                                    case 3://3.Bank Beeraha
                                        System.out.println("Fadlan gali Account_ka");
                                        int account1 = input.nextInt();
                                        System.out.println("Fadlan  geli macluumaad");
                                        String macluumaad2 = input.next();
                                        System.out.println("Fadlan geli lacagta");
                                        int mon6 = input.nextInt();
                                        System.out.println("Fadlan geli Numberkaaga sirta ee bankiga");
                                        int Numkag = input.nextInt();
                                        int num2_user = 123465;
                                        if (num2_user == Numkag) {
                                            System.out.println("ma hubtaa inaad $" + mon6 + " u wareejiso Bank Account " + account1 + "? \n1.Haa\n2.Maya");
                                            int Beeraha = input.nextInt();
                                            if (Beeraha == 1) {
                                                System.out.println("$" + mon6 + " Ayaa u wareejisay " + account1 + "" + (balance - mon6));
                                            } else
                                                System.out.println("Waad Ku guuleesatay inaad iska joojiso adeegaan");
                                        } else System.out.println("Pinkaaga bankiga Beeraha Waa Khalad");
                                        break;
                                    case 4://4.Salaam Sch
                                        System.out.println("Fadlan gali Account_ka");
                                        int account2 = 34567;
                                        account2 = input.nextInt();
                                        if (account2 == 34567) {
                                            System.out.println("Fadlan geli lacagta");
                                            int money5 = input.nextInt();
                                            System.out.println("Ma hubtaa in aad " + money5 + "$" + " u wareejineesid " + account2 + "?");
                                            System.out.println("1.haa");
                                            System.out.println("2.maya");
                                            double doro = input.nextDouble();
                                            if (doro == 1) {
                                                System.out.println("[-EVCPlus-]$" + money5 + " ayaad uwareejisay " + account2 + " Haraagaaga EVCPLUS Waa $" + (balance - money5) + "." +
                                                        " 20 sano oo adeeg bulsho ah");
                                            } else
                                                System.out.println("Waad Ku guuleesatay inaad iska joojiso adeegaan");
                                        }
                                        break;
                                    default:
                                        System.out.println("sorry");
                                }//End slam bank 4
                                //default:System.out.println("End");
                            case 5://ka wareeji Accont-kaga
                                System.out.println("Fadlan gali Account_ka");
                                int Account = input.nextInt();
                                System.out.println("Fadlan geli lacagta");
                                int Mone = input.nextInt();
                                System.out.println("Fadlan  geli macluumaad");
                                String macluumaad1 = input.next();

                                System.out.println("Fadlan geli Numberkaaga sirta ee bankiga");
                                int Numkaga = input.nextInt();
                                int num1_user = 123465;
                                if (num1_user == Numkaga) {
                                    System.out.println("ma hubtaa inaad USD" + Mone + " u wareejiso Bank Account " + Account + "? \n1.Haa\n2.Maya");
                                    int Darasalaam = input.nextInt();
                                    if (Darasalaam == 1) {
                                        System.out.println("$" + Mone + " Ayaa u wareejisay " + Account + "" + (balance - Mone));
                                    } else System.out.println("mahadsanid");
                                } else System.out.println("Pinkaaga bankiga Waa Khalad");
                                break;
                            case 6://Hubi wareejin account
                                System.out.println("Fadlan Geli OTP");
                                int OTP = input.nextInt();
                                System.out.println("Mahubta inaa aqbashid lacag diridan? \n1.Haa 2.Maya");
                                int otp = input.nextInt();
                                if (otp == 1) {
                                    System.out.println("waad ku guulesatay howshan");
                                } else System.out.println("mahadsanid");
                                break;
                            case 7://7.maareynta Bankiga
                                System.out.println("maareynta Bankiga");
                                System.out.println("1.Bedel PIN-k Bangiga");
                                System.out.println("2.Bedel Passwordka Ebank");
                                int check1 = input.nextInt();
                                switch (check1) {// doorashooyinka 7.Maareynta Bangiga

                                    case 1://Bedel numberka sirta ha
                                        System.out.println("Fadlan geli Numberkaaga sirta ee Bangiga");
                                        int Numberkaaga_sirta = input.nextInt();
                                        System.out.println("Fadlan geli pin_ka cusb ee Bangiga");
                                        int pin_ka_cusb = input.nextInt();
                                        System.out.println("Hubi PIN-kaaga cusub");
                                        int Hubi_Pin = input.nextInt();
                                        int Pin_ka_hor = Hubi_Pin;//input.nextInt();
                                        if (Pin_ka_hor != Hubi_Pin) {
                                            System.out.println("Invalid input format(length)");
                                        } else
                                            System.out.println("Waad ku guuleysatay inaad badasho PIN_kaaga binkaga");
                                        break;
                                    case 2://2.Bedel Passwordka Ebank
                                        System.out.println("Fadlan geli Numberkaaga sirta ee Bangiga");
                                        int Numberkaaga_sirta1 = input.nextInt();
                                        System.out.println("Unable to connect to the remote server");
                                        break;
                                }//End doorashooyinka 7.Maareynta Bangiga
                            case 8: //kala bax
                                System.out.println("falangeli aqonsiga codsiga");
                                String codsig = input.next();
                        }//End Tixaha slam bank
                        break;
                    case 7://7.Maareynta
                        System.out.println("Maareynta");
                        System.out.println("1.Bedel lambarka sirta ha");
                        System.out.println("2.Bedel luqada");
                        System.out.println("3.wargalin mobile lumay");
                        System.out.println("4.lacag xerasho");
                        System.out.println("5.U celi lacag qaldantay");
                        System.out.println("6EnableMobile Banking ");
                        int check = input.nextInt();
                        switch (check) {// doorashooyinka 7.Maareynta

                            case 1://Bedel numberka sirta ha
                                System.out.println("Fadlan geli pin-kaaga cusub");
                                pass = input.nextInt();
                                System.out.println("Hubi PIN-kaaga cusub");
                                int Hubi = input.nextInt();

                                int Qalad = Hubi;//input.nextInt();
                                if (Qalad != Hubi) {
                                    System.out.println("Invalid input format(length)");
                                } else System.out.println("Waad ku guuleysatay inaad binkaga badasho");
                                break;
                            case 2://bedel luqada
                                System.out.println("Fadlan dooro luqada");
                                System.out.println("1.Engish");
                                System.out.println("2.Somali");
                                int luqad = input.nextInt();
                                if (luqad == 1) {
                                    System.out.println("You have succcessfully changed your language");
                                } else if (luqad == 2) {
                                    System.out.println("Waad ku guuleysatay inaad luqadada baasho");
                                } else
                                    System.out.println("Fadlan dooor number sax ah");
                                break;
                            case 3://wargalin mobile lumay
                                System.out.println("Fadlan geli mobile-ka lumay");
                                int lumya_num = input.nextInt();
                                System.out.println("Fadlan geli numberkiisa sirta ah");
                                break;
                            case 4://lacag xerasho
                                System.out.println("Fadlan geli number-ka khaladka ah");
                                int khalad_num = input.nextInt();
                                System.out.println("fadlan geli numberka saxda");
                                int num_sax = input.nextInt();
                                break;
                            case 5://U celi lacag qaldantay
                                System.out.println("Fadlan geli aqoonsiga lacag diraha");
                                int aqoonsi = input.nextInt();
                                break;
                            case 6://EnableMobile Banking
                                System.out.println("Fadlan Geli numberka is diiwaan gelinta");
                                int diiwan_num = input.nextInt();
                                break;
                            default:
                                System.out.println("There is nothing left for you to stop");
                                break;
                        }//End dooroshada 7
                        break;
                    case 8:// 8. Taaj
                        System.out.println("Taaj");
                        System.out.println("1. Gudaha");
                        System.out.println("2. Dibada");
                        System.out.println("3. Ogoow Khidmada");
                        System.out.println("4. Maclumadka Xawaaladda");
                        System.out.println("5. Jooji Xawaaladda");
                        System.out.println("6. Fur Xawaaladda ");
                        int taaj = input.nextInt();
                        switch (taaj) {//starta taaj gudaha
                            case 1://1. Gudaha
                                System.out.println("Fadlan dooro shirkada");
                                System.out.println("1.E-KAAFI");
                                System.out.println("2.E-SAHAL");
                                //variables
                                int teleefonka_qaataha = input.nextInt();
                                String Magaca_Qaataha = input.next();
                                String Magaalada_Qaataha = input.next();
                                int geli_lacagta = input.nextInt();
                                String Faahfaahin = input.next();
                                int aqonsiga_qaataha = input.nextInt();
                                int hubitel = input.nextInt();
                                int shirkada = input.nextInt();
                                switch (shirkada) {//Tixaha Gudaha
                                    case 1:// e-kaafi
                                        System.out.println("fadlan geli teleefonka qaataha");
                                        teleefonka_qaataha = input.nextInt();

                                        System.out.println("Fadlan geli Magaca Qaataha");
                                        Magaca_Qaataha = input.next();
                                        System.out.println("Fadlan geli Magaalada Qaataha uu joogo");
                                        Magaalada_Qaataha = input.next();
                                        System.out.println("Fadlan geli lacagta");
                                        geli_lacagta = input.nextInt();
                                        System.out.println("khiimada ma xisaabtaada ayaa laga jarayaa");
                                        System.out.println("1. Haa");
                                        System.out.println("2. Maya");
                                        hubitel = input.nextInt();
                                        if (hubitel == 1) {
                                            System.out.println("<-EVCPlus->\nWaxaad $" + (balance - geli_lacagta) + "  ugu shubtay Number ka " + (teleefonka_qaataha));
                                        } else
                                            System.out.println("waan ka xumnahe");
                                        break;

                                    case 2: // e-sahal
                                        System.out.println("fadlan geli teleefonka qaataha");
                                        teleefonka_qaataha = input.nextInt();
                                        //int Qaataha = input.nextInt();
                                        System.out.println("Fadlan geli Magaca Qaataha");
                                        Magaca_Qaataha = input.next();
                                        System.out.println("Fadlan geli Magaalada Qaataha uu joogo");
                                        Magaalada_Qaataha = input.next();
                                        System.out.println("Fadlan geli lacagta");
                                        geli_lacagta = input.nextInt();
                                        System.out.println("khiidmada ma xisaabtaada ayaa laga jarayaa");
                                        System.out.println("1. Haa");
                                        System.out.println("2. Maya");

                                        if (hubitel == 1) {
                                            System.out.println("<-EVCPlus-> \nWaxaad $" + (balance - geli_lacagta) + "  ugu shubtay Number ka " + (teleefonka_qaataha));
                                        } else System.out.println("mahadsanid");
                                        break;
                                    default:
                                }// dhamadka tixaha tajka gudaha
                                // dibada

                            case 2:
                                System.out.println("fadlan geli teleefonka qaataha");
                                teleefonka_qaataha = input.nextInt();
                                System.out.println("Fadlan geli Magaca Qaataha");
                                Magaca_Qaataha = input.next();
                                System.out.println("Fadlan geli Magaalada Qaataha uu joogo");
                                Magaalada_Qaataha = input.next();
                                System.out.println("Fadlan geli Faahfaahin");
                                Faahfaahin = input.next();
                                System.out.println("Fadlan geli lacagta");
                                geli_lacagta = input.nextInt();
                                System.out.println("khiimada ma xisaabtaada ayaa laga jarayaa");
                                System.out.println("1. Haa");
                                System.out.println("2. Maya");
                                hubitel = input.nextInt();
                                if (hubitel == 1) {
                                    System.out.println("<-EVCPlus->\nWaxaad $" + (balance - geli_lacagta) + "  ugu shubtay Number ka " + (teleefonka_qaataha));
                                } else
                                    System.out.println("waan ka xumnahe");
                                break;

                            case 3: // 3. ogow qidmad
                                System.out.println("1. Pay to EvcPlus TMT");
                                System.out.println("2.Taaj");
                                System.out.println("3.TaajPay");
                                System.out.println("4.New ETaaj");
                                System.out.println("5.Taaj IPS");
                                int pay = input.nextInt();
                                switch (pay) {//1. Pay to EvcPlus TMT")
                                    case 1:
                                        System.out.println("fadlan geli teleefonka qaataha");
                                        teleefonka_qaataha = input.nextInt();
                                        System.out.println("Fadlan geli Magaca Qaataha");
                                        Magaca_Qaataha = input.next();
                                        System.out.println("Fadlan geli Magaalada Qaataha uu joogo");
                                        Magaalada_Qaataha = input.next();
                                        System.out.println("Fadlan geli Faahfaahin");
                                        Faahfaahin = input.next();
                                        System.out.println("Fadlan geli lacagta");
                                        geli_lacagta = input.nextInt();
                                        System.out.println("khiimada ma xisaabtaada ayaa laga jarayaa");
                                        System.out.println("1. Haa");
                                        System.out.println("2. Maya");
                                        hubitel = input.nextInt();
                                        if (hubitel == 1) {
                                            System.out.println("<-EVCPlus-> \nWaxaad $" + (balance - geli_lacagta) + "  ugu shubtay Number ka " + teleefonka_qaataha);
                                        } else System.out.println("Mahadsanid");
                                        break;

                                    case 2:
                                        System.out.println("fadlan geli teleefonka qaataha");
                                        teleefonka_qaataha = input.nextInt();
                                        System.out.println("Fadlan geli Magaca Qaataha");
                                        Magaca_Qaataha = input.next();
                                        System.out.println("Fadlan geli Magaalada Qaataha uu joogo");
                                        Magaalada_Qaataha = input.next();
                                        System.out.println("Fadlan geli Faahfaahin");
                                        Faahfaahin = input.next();
                                        System.out.println("Fadlan geli lacagta");
                                        geli_lacagta = input.nextInt();
                                        System.out.println("khiimada ma xisaabtaada ayaa laga jarayaa");
                                        System.out.println("1. Haa");
                                        System.out.println("2. Maya");
                                        hubitel = input.nextInt();
                                        if (hubitel == 1) {
                                            System.out.println("<-EVCPlus->\n Waxaad $" + (balance - geli_lacagta) + "  ugu shubtay Number ka " + teleefonka_qaataha);
                                        } else
                                            System.out.println("waan ka xumnahe");
                                        break;
                                    case 3:
                                        System.out.println("fadlan geli teleefonka qaataha");
                                        teleefonka_qaataha = input.nextInt();
                                        System.out.println("Fadlan geli Magaca Qaataha");
                                        Magaca_Qaataha = input.next();
                                        System.out.println("Fadlan geli Magaalada Qaataha uu joogo");
                                        Magaalada_Qaataha = input.next();
                                        System.out.println("Fadlan geli Faahfaahin");
                                        Faahfaahin = input.next();
                                        System.out.println("Fadlan geli lacagta");
                                        geli_lacagta = input.nextInt();
                                        System.out.println("khiimada ma xisaabtaada ayaa laga jarayaa");
                                        System.out.println("1. Haa");
                                        System.out.println("2. Maya");
                                        hubitel = input.nextInt();
                                        if (hubitel == 1) {
                                            System.out.println("<-EVCPlus-> \nWaxaad $" + (balance - geli_lacagta) + "  ugu shubtay Number ka " + (teleefonka_qaataha));
                                        } else
                                            System.out.println("waan ka xumnahe");
                                        break;
                                    case 4:
                                        System.out.println("fadlan geli teleefonka qaataha");
                                        teleefonka_qaataha = input.nextInt();
                                        System.out.println("Fadlan geli Magaca Qaataha");
                                        Magaca_Qaataha = input.next();
                                        System.out.println("Fadlan geli Magaalada Qaataha uu joogo");
                                        Magaalada_Qaataha = input.next();
                                        System.out.println("Fadlan geli Faahfaahin");
                                        Faahfaahin = input.next();
                                        System.out.println("Fadlan geli lacagta");
                                        geli_lacagta = input.nextInt();
                                        System.out.println("khiimada ma xisaabtaada ayaa laga jarayaa");
                                        System.out.println("1. Haa");
                                        System.out.println("2. Maya");
                                        hubitel = input.nextInt();
                                        if (hubitel == 1) {
                                            System.out.println("<-EVCPlus->\n Waxaad $" + (balance - geli_lacagta) + "  ugu shubtay Number ka " + (teleefonka_qaataha));
                                        } else
                                            System.out.println("waan ka xumnahe");

                                        break;
                                    case 5:
                                        System.out.println("fadlan geli teleefonka qaataha");
                                        teleefonka_qaataha = input.nextInt();
                                        System.out.println("Fadlan geli Magaca Qaataha");
                                        Magaca_Qaataha = input.next();
                                        System.out.println("Fadlan geli Magaalada Qaataha uu joogo");
                                        Magaalada_Qaataha = input.next();
                                        System.out.println("Fadlan geli Faahfaahin");
                                        Faahfaahin = input.next();
                                        System.out.println("Fadlan geli lacagta");
                                        geli_lacagta = input.nextInt();
                                        System.out.println("khiimada ma xisaabtaada ayaa laga jarayaa");
                                        System.out.println("1. Haa");
                                        System.out.println("2. Maya");
                                        hubitel = input.nextInt();
                                        if (hubitel == 1) {
                                            System.out.println("<-EVCPlus-> \nWaxaad $" + (balance - geli_lacagta) + "  ugu shubtay Number ka " + (teleefonka_qaataha));
                                        } else
                                            System.out.println("waan ka xumnahe");
                                        break;
                                    default:
                                }

                            case 4://4. Maclumadka Xawaaladda
                                System.out.println("fadlan geli aqonsiga  qaataha");
                                int aqonsiga_qaataha1 = input.nextInt();
                                System.out.println("Fadlan geli Magaca Qaataha");
                                String Magaca_Qaatah = input.next();
                                System.out.println("Fadlan geli Magaalada Qaataha uu joogo");
                                String Magaalada_Qaatah = input.next();
                                System.out.println("Fadlan geli Faahfaahin");
                                String Fahfaahin = input.next();
                                System.out.println("Fadlan geli lacagta");
                                int geli_lacagt = input.nextInt();
                                System.out.println("khiimada ma xisaabtaada ayaa laga jarayaa");
                                System.out.println("1. Haa");
                                System.out.println("2. Maya");
                                hubitel = input.nextInt();
                                if (hubitel == 1) {
                                    System.out.println("<-EVCPlus-> \nWaxaad $" + (balance - geli_lacagt) + "  ugu shubtay Number ka " + aqonsiga_qaataha1);
                                } else
                                    System.out.println("waan ka xumnahe");

                                break;

                            case 5://5. Jooji Xawaaladda
                                System.out.println("fadlan geli aqoosiga  Dirada");
                                String aqoosiga_Dirada = input.next();
                                System.out.println("Fadlan geli Magaca Qaataha");
                                String Magaca_Qaataha1 = input.next();
                                System.out.println("Fadlan geli Magaalada Qaataha uu joogo");
                                String Magaalada_Qaataha1 = input.next();
                                System.out.println("Fadlan geli Faahfaahin");
                                String Faahfaahin1 = input.next();
                                System.out.println("Fadlan geli lacagta");
                                int geli_lacagta1 = input.nextInt();
                                break;
                            case 6: //6. Fur Xawaaladda
                                System.out.println("fadlan geli teleefonka qaataha");
                                teleefonka_qaataha = input.nextInt();
                                System.out.println("Fadlan geli Magaca Qaataha");
                                Magaca_Qaataha = input.next();
                                System.out.println("Fadlan geli Magaalada Qaataha uu joogo");
                                Magaalada_Qaataha = input.next();
                                System.out.println("Fadlan geli lacagta");
                                geli_lacagta = input.nextInt();
                                System.out.println("khiimada ma xisaabtaada ayaa laga jarayaa");
                                System.out.println("1. Haa");
                                System.out.println("2. Maya");
                                hubitel = input.nextInt();
                                if (hubitel == 1) {
                                    System.out.println("<-EVCPlus-> \nWaxaad $" + (balance - geli_lacagta) + "  ugu shubtay Number ka " + (teleefonka_qaataha));
                                } else
                                    System.out.println("waan ka xumnahe");
                                break;
                            default:
                                System.out.println("Invalid option selected");
                        } // End of Taaj switch
                        break;
                    default:
                        System.out.println("Invalid option selected");
                } // End of main switch
            } else {
                System.out.println("PIN incorrect");
            }
        } else {
            System.out.println("Invalid USSD code");
        }
        input.close();
    }
}