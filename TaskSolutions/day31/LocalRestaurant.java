package TaskSolutions.day31;

public class LocalRestaurant {

        public static void main(String[] args) {
            Server[] servers = {
                    new Server("Yasin", 29, 15, false),
                    new Server("Sabrine", 28, 10, false),
                    new Server("Karim", 27, 12, false),
                    new Server("Aysel", 26, 20, true),
                    new Server("Kamal", 25, 23, true),
            };

            chef[] chefs = {
                    new chef("Halim", 23, 35, true),
                    new chef("Habib", 22, 26, false),
                    new chef("Bojan", 21, 27, true),
            };

            Restaurant restaurant = new Restaurant("Mahdi", "McLean", 4);
            restaurant.hireServers(servers);
            restaurant.hireChefs(chefs);

            System.out.println(restaurant);

        }

    }

