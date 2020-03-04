#include <iostream>
#include "Records.h"

int main()
{
  //ERROR: Records * my_records = new Records();
  Records& record_board = Records::instance();
  std::cout<<"FIRST records\n";
  record_board.update_record("Player A", false);
  record_board.show_records();

  std::cout<<"SECOND records\n";
  Records& another = Records::instance();
  another.update_record("Player B", true);
  another.update_record("Player B", true);
  another.show_records();

  std::cout<<"THIRD records\n";
  Records& yet_another = Records::instance();
  yet_another.update_record("Player A", true);
  yet_another.show_records();

  return 0;
}