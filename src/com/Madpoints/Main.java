package com.Madpoints;

public class Main {

    public static class Hotel {
        private String name;
        private int numRooms;
        private int numRoomsRented;
        private boolean hasPool;

        public Hotel(String name,int numRooms, int numRoomsRented, boolean hasPool) {
            this.name = name;
            this.numRooms = numRooms;
            this.numRoomsRented = numRoomsRented;
            this.hasPool = hasPool;
        }


        public void RentRoom() {
            if (numRoomsRented + 1 <= numRooms) {
                System.out.println("Rented");
                numRoomsRented++;
                System.out.println("Rooms available: " + (numRooms - numRoomsRented));
            } else {
                System.out.println("No Vacancy");
            }
        }

        public void RentRoom(int roomsNeeded) {
            if (numRoomsRented + roomsNeeded <= numRooms) {
                System.out.println("Rented");
                numRoomsRented += roomsNeeded;
                System.out.println("Rooms available: " + (numRooms - numRoomsRented));
            } else {
                System.out.println("No Vacancy");
            }
        }
    }

    public static void main(String[] args) {
	    Hotel hotel = new Hotel("Bell Vue", 15, 10, true);

        hotel.RentRoom();
        hotel.RentRoom(3);
        hotel.RentRoom(2);
    }
}
