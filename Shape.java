package com.company;

import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> list;

    public Shape() {
        list = new ArrayList<>();
    }

    public ArrayList<Point> getList() {
        return list;
    }

    public void setList(ArrayList<Point> list) {
        this.list = list;
    }

    public void addPoint(Point p){
        list.add(p);
    }

    public void getPoints(){
        for (Point point : list)
            System.out.println("(" + point.getX() + "," + point.getY() + ")");
    }

    public double getCalculatePerimeter(){
        double sum = 0;
        for (int i = 0; i < list.size(); ++i){
            if (i == list.size() - 1)
                sum += distance(list.get(0).getX(), list.get(i).getX(), list.get(0).getY(), list.get(i).getY());
            else
                sum += distance(list.get(i + 1).getX(), list.get(i).getX(), list.get(i + 1).getY(), list.get(i).getY());
        }
        return sum;
    }

    public double getLongestSide(){
        double max = 0;
        for (int i = 0; i < list.size(); ++i){
            if (i == list.size() - 1)
                break;
            if (max < distance(list.get(i + 1).getX(), list.get(i).getX(), list.get(i + 1).getY(), list.get(i).getY()))
                max = distance(list.get(i + 1).getX(), list.get(i).getX(), list.get(i + 1).getY(), list.get(i).getY());
        }
        return max;
    }

    public double getAverageSide(){
        return getCalculatePerimeter() / list.size();
    }

    private double distance(double x1, double x2, double y1, double y2){
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
