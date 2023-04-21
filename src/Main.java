public class Main {
    public static void main(String[] args) {
        ModelOfCar bmw5Series = new ModelOfCar("BMW", "5 series");
        ModelOfCar mercedesC63 = new ModelOfCar("Mercedes-Benz", "C63");
        ModelOfCar audiA6 = new ModelOfCar("Audi", "A6");

        EngineOfCar bmw5SeriesBaseEngine = new EngineOfCar("B48B20", 2.0, 249, 9000);
        EngineOfCar bmw5SeriesPremiumEngine = new EngineOfCar("B58B30", 3.0, 340, 15000);
        EngineOfCar mercedesC63BaseEngine = new EngineOfCar("M139", 2.0, 470, 27000);
        EngineOfCar mercedesC63PremiumEngine = new EngineOfCar("M313", 4.0, 592, 35000);
        EngineOfCar audiA6BaseEngine = new EngineOfCar("A414B2", 1.8, 220, 10000);
        EngineOfCar audiA6PremiumEngine = new EngineOfCar("A612B12", 4.2, 421, 19500);

        SalonEquipment bmw5SeriesBaseEquipment = new SalonEquipment("в базовій комплектації", 30000, "МКПП");
        SalonEquipment bmw5SeriesPremiumEquipment = new SalonEquipment("в преміум комплектації", 50000, "АКПП");
        SalonEquipment mercedesC63BaseEquipment = new SalonEquipment("в базовій комплектації", 50000, "АКПП");
        SalonEquipment mercedesC63PremiumEquipment = new SalonEquipment("в преміум комплектації", 70000, "АКПП");
        SalonEquipment audiA6BaseEquipment = new SalonEquipment("в базовій комплектації", 35000, "МКПП");
        SalonEquipment audiA6PremiumEquipment = new SalonEquipment("в мреміум комплектації", 52000, "АКПП");

        PriceOfCar finalp = new PriceOfCar();
        finalp.price = bmw5SeriesBaseEngine.enginePrice + bmw5SeriesPremiumEquipment.priceOfEquipment;



        System.out.printf("Обираючи %s %s %s, Ви отримаєте автомобіль на %s з мотором %s, об'м якого %.1fл. та %d кінських сил. Вартість автомобіля буде %d$ .%n",
                bmw5Series.brand, bmw5Series.model, bmw5SeriesPremiumEquipment.classOfEquipment, bmw5SeriesPremiumEquipment.transmision,
                bmw5SeriesPremiumEngine.modelOfEngine, bmw5SeriesPremiumEngine.capacity, bmw5SeriesPremiumEngine.horsePower, finalp.price);
    }
}