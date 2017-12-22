package com.Madpoints;

public class Main {

    public static class Hotel {
        private String name;
        private int numRooms;
        private int numFloors;
        private int roomsPerFloor;
        private int numRoomsRented;
        private boolean hasPool;

        public Hotel(String name, int numRooms, int numFloors, int numRoomsRented, boolean hasPool) {
            this.name = name;
            this.numRooms = numRooms;
            this.numFloors = numFloors;
            this.roomsPerFloor = numRooms / numFloors;
            this.numRoomsRented = numRoomsRented;
            this.hasPool = hasPool;
        }


        public void RentRoom() {
            if (numRoomsRented + 1 <= numRooms) {
                Room room = new Room(203, false);
                System.out.println("Rented");
                numRoomsRented++;
                System.out.println("Rooms available: " + (numRooms - numRoomsRented));
            } else {
                System.out.println("No Vacancy");
            }
        }

        public void RentRoom(int roomsNeeded) {
            if (numRoomsRented + roomsNeeded <= numRooms) {
                for (int i = 0; i < roomsNeeded; i++) {
                    Room room = new Room(203, false);
                }
                System.out.println("Rented");
                numRoomsRented += roomsNeeded;
                System.out.println("Rooms available: " + (numRooms - numRoomsRented));
            } else {
                System.out.println("No Vacancy");
            }
        }
    }

    private static class Room {
        private int RoomNum;
        private boolean HasBalcony;

        private Room(int roomNum, boolean hasBalcony) {
            this.RoomNum = roomNum;
            this.HasBalcony = hasBalcony;
        }
    }

    public static void main(String[] args) {
        Hotel hotel = new Hotel("Bell Vue", 200, 10, 100, true);

        hotel.RentRoom();
        hotel.RentRoom(3);
        hotel.RentRoom(2);
    }
}
