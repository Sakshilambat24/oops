package Abstraction;

public class TestfutureService {
    public static void main(String[] args) {
        featureService fs=new featureService() {
            @Override
            void addfutureService(String feature) {
                System.out.println("class test");

            }
        } ;
        }
    }

