#include<iostream>
#include<vector>
#include<list>
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
using namespace std;

int main() {
	vector<int> obj;


	for (int i = 0; i < 10; i++) {
		obj.push_back(i);
		cout << obj[i] << ",";
	}
	int len = obj.size();

	for (int i = 0; i < 5; i++)
	{
		obj.pop_back();
	}

	cout << "\n" << endl;

	len = obj.size();
	for (int i = 0; i < len; i++) {
		cout << obj[i] << ",";
	}

	cout << "\n" << "µü´úÆ÷" << endl;
	//µü´úÆ÷iterator
	vector<int>::iterator it;
	for (it = obj.begin(); it != obj.end(); it++) {
		cout << *it << ",";
	}

	system("pause");
	return 0;
}

