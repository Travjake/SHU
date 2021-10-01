#include "MyTime.h"//For a local file ""
#include <iostream>//Packages program <>

using namespace std;

MyTime::MyTime() {//Links to .h file
	hours = minutes = seconds = 0;
}


void MyTime::displayTime() {//""
	cout << hours << "h" << minutes << "m" << seconds << "s";
}
