#include<iostream>
using namespace std;

class Student
{
    public:
        string fullName;
        int rollNum;
        double semPerentage;
        string collegeName;
        int collegeCode;
        Student()
        {
            cout<<"Student class initialized!!\n";
        }
        ~Student(){}
};

int main()
{
    Student sasi;
    cout<<"Enter your name : ";
    getline(cin,sasi.fullName);
    cout<<"Enter your roll number : ";
    cin>>sasi.rollNum;
    cout<<"Enter your sem percentage : ";
    cin>>sasi.semPerentage;
    cout<<"Enter your college name : ";
    cin>>sasi.collegeName;
    cout<<"Enter your college code : ";
    cin>>sasi.collegeCode;
    cout<<"Name : "<<sasi.fullName<<endl;
    cout<<"RollNum : "<<sasi.rollNum<<endl;
    cout<<"SemPercentage : "<<sasi.semPerentage<<endl;
    cout<<"CollegeName : "<<sasi.collegeName<<endl;
    cout<<"CollegeCode : "<<sasi.collegeCode<<endl;
    return 0;
}
