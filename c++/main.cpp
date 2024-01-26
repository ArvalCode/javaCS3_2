// Your First C++ Program

#include <iostream>

class math{
    private:
    int _x, _y;
    public:
    math(int x, int y){
        _x = x;
        _y = y;
    }
    int add(){
        return _x + _y;
    }
    int subtract(){
        return _x - _y;
    }
};

int main() {
    int x, y;
    std::cout << "Enter X: ";
    std::cin >> x;

    std::cout << "\nEnter Y: ";
    std::cin >> y;

    math obj(x, y);
    std::cout << "\nSUM: " << obj.add();
    std::cout << "\nDIFF: " << obj.subtract();
    std::cout << "\n\n\n";
    return 0;
}
