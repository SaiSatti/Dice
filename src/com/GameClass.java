package com;

import java.util.ArrayList;

import util.FiveDices;

public class GameClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FiveDices fd= new FiveDices();
		fd.roll();
		ArrayList<Integer>list=new ArrayList<Integer>();
				
		list.add(fd.getDie1());
		list.add(fd.getDie2());
		list.add(fd.getDie3());
		list.add(fd.getDie4());
		list.add(fd.getDie5());
		System.out.println(list.get(0)+" "+list.get(1)+" "+list.get(2)+" "+list.get(3)+" "+list.get(4));
		int points=0;
		for(int i=0;i<=1;i++)
		{
		if(list.get(i)==1 && list.get(i+1)== 1&&list.get(i+2)==1 || list.get(i+1)==1 && list.get(i+2)== 1&&list.get(i+3)==1||list.get(i+2)==1 && list.get(i+3)== 1&&list.get(i+4)==1)
		{
			points=1000;
		}
		else if(list.get(i)==2 && list.get(i+1)== 2&&list.get(i+2)==2 || list.get(i+1)==2 && list.get(i+2)== 2&&list.get(i+3)==2||list.get(i+2)==2 && list.get(i+3)== 2&&list.get(i+4)==2)
		{
			points=200;
		}
		else if(list.get(i)==3 && list.get(i+1)== 3&&list.get(i+2)==3 || list.get(i+1)==3 && list.get(i+2)== 3&&list.get(i+3)==3||list.get(i+2)==3 && list.get(i+3)== 3&&list.get(i+4)==3)
		{
			points=300;
		}
		else if(list.get(i)==4 && list.get(i+1)== 4&&list.get(i+2)==4 || list.get(i+1)==4 && list.get(i+2)== 4&&list.get(i+3)==4||list.get(i+2)==4 && list.get(i+3)== 4&&list.get(i+4)==4)
		{
			points=400;
		}
		else if(list.get(i)==5 && list.get(i+1)== 5&&list.get(i+2)==5 || list.get(i+1)==5 && list.get(i+2)== 5&&list.get(i+3)==5||list.get(i+2)==5 && list.get(i+3)== 5&&list.get(i+4)==5)
		{
			points=500;
		}
		else if(list.get(i)==6 && list.get(i+1)== 6&&list.get(i+2)==6 || list.get(i+1)==6 && list.get(i+2)== 6&&list.get(i+3)==6||list.get(i+2)==6 && list.get(i+3)== 6&&list.get(i+4)==6)
		{
			points=600;
		}
		}
		for(int i=0;i<5;i++){
		if(list.get(i)==1){
			points=points+100;
		}
		if(list.get(i)==4){
			points=points+40;
		}
		if(list.get(i)==2||list.get(i)==3||list.get(i)==5||list.get(i)==6){
			points=points+0;
		}
		}
		
		System.out.println(points);
	}

}
