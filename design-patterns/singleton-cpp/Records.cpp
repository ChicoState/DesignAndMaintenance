#include "Records.h"
#include <iostream>
#include <map>

// Protected constructor should not be called and does nothing
Records::Records(){
}

// Returns the singleton instance of the records
Records& Records::instance(){
  static Records _instance;
  return _instance;
}

// Adds a player's won or loss to the record of their name
void Records::update_record(const std::string player_name, bool won){
  Record temp;
  if( _player_records.find(player_name) != _player_records.end() ){
    temp = _player_records[player_name];
  }
  if( won ){
    temp.wins++;
  }
  else{
    temp.losses++;
  }
  _player_records[player_name] = temp;
}

// Display all the records to standard out
void Records::show_records(){
  if( _player_records.empty() ){
    std::cout<<"No games played yet.\n";
  }
  else{
    for(auto const& player: _player_records ){
      std::cout<<player.first<<": "
               <<player.second.wins<<"-"
               <<player.second.losses<<"\n";
    }
  }
}