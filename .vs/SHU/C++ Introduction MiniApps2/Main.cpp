#include <iostream>
#include <time.h>
#include "MyTime.h"
using namespace std;

void choosePlayer();
void addPlayer();
void removePlayer();
void sortPlayersAlphabetically();
void sortByHighestScore();

int main() {
	MyTime mytime;
	mytime.displayTime();

	int option; 
	srand(time(nullptr));

	do {
		cout << "Welcome to Champion Yahtzee\n";
		cout << "---------------------------\n\n";
		cout << "Player Name             Highest Score\n";
		cout << "-----------             -------------\n\n\n\n\n";
		cout << "1) Choose player\n";
		cout << "2) Add player\n";
		cout << "3) Remove Player\n";
		cout << "4) Sort Alphabetically\n";
		cout << "9) Quit\n";

		cout << "Please Enter an Option:\t";

		cin >> option;

		switch (option)
		{
		case 1: choosePlayer(); break;
		case 2: addPlayer();  break;
		case 3: removePlayer();  break;
		case 4: sortPlayersAlphabetically(); break;
		case 9: sortByHighestScore(); break; //leave Blanks for Graceful exit, Always Use DO WHILELELELELELELELELELE
		default:
			cout << "Invalid Input";
		}
	} while (option != 9);
	
	return 0;
}

void choosePlayer() {//Temp Keep Counting 

	int random = rand() % 10;
	int num1 = random;
	int Answer;


	for (int i = 0; i < 10; i++)
	{
		int random = rand() % 10;
		int num2 = random;
		char operat = (rand() % 2 < 1 ? '+' : '-');

		cout << "Question " << i + 1 << ":\t"<< num1 << operat << num2 << "=   ";
		cin >> Answer;
		cout << "\n";

		if (Answer == num1 + num2)
		{
			cout << "Correct\n";
			num1 = Answer;
		}
		else {
			cout << "Incorrect\n\n\n";
			break;
		}
	}
}
void addPlayer() {

}
void removePlayer() {

}
void sortPlayersAlphabetically() {

}
void sortByHighestScore() {

}
