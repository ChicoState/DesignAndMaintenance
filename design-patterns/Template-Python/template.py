import sys
class CloudStorage(object):
    
    def upload_data(self, storage_space):
        print("Requesting to save Data on cloud.....")
        if storage_space >  self.storage_capacity:
            print("Not enough space to save.Purchase more storage space!")
            sys.exit(1)
            

    def store_on_Server(self):
        pass
    
    def access_data(self):
        pass
    
    def move_to_cloud(self, storage_space):
        self.upload_data(storage_space)
        self.store_on_Server()
        self.access_data()

class Store_Movie(CloudStorage):
    
    def __init__(self):
        self.storage_capacity = 3
    
    def store_on_Server(self):
        print("1. Saved Movie on remote server.")
    
    def access_data(self):
        print("2. Ready to Watch.")

class Store_Game(CloudStorage):
    def __init__(self):
        self.storage_capacity = 7
    
    def store_on_Server(self):
        print("1. Saved Game on remote server.")
        
    def access_data(self):
        print("2. Ready to Play.")

class Store_MusicAlbum(CloudStorage):
    def __init__(self):
        self.storage_capacity = 2
    
    def store_on_Server(self):
        print("1. Saved Music Album on remote server")
        
    def access_data(self):
        print("2. Ready to Play Album.")

if __name__ == '__main__':
    c = Store_Game()
    c.move_to_cloud(6)
    print("*" * 35)
    a = Store_MusicAlbum()  
    a.move_to_cloud(1)
    print("*" * 35)
    p = Store_Movie()  
    p.move_to_cloud(4)
