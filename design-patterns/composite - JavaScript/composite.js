function Section(name) {
  this.name = name;
}

Section.prototype.display = function () {
  console.log(this.name);
}

function Chapter(name) {
  this.name = name;
  this.sections = [];
}

Chapter.prototype.add = function (Section) {
  this.sections.push(Section);
}

Chapter.prototype.remove = function (Section) {
  for (let i = 0, length = this.sections.length; i < length; i++) {
      if (this.sections[i] === Section) {
          this.sections.splice(i, 1);
          return true;
      }
  }
  return false;
}

Chapter.prototype.getSectionName = function (index) {
  return this.sections[index].name;
}

Chapter.prototype.display = function() {
  console.log(this.name);
  for (let i = 0, length = this.sections.length; i < length; i++) {
      console.log("    ", this.getSectionName(i));
  }
}

ChapterOne = new Chapter('Chapter One');
ChapterTwo = new Chapter('Chapter Two');
ChapterThree = new Chapter('Chapter Three');

sectionOne = new Section('Section One');
sectionTwo = new Section('Section Two');
sectionThree = new Section('Section Three');
sectionFour = new Section('Section Four');

ChapterOne.add(sectionOne);
ChapterOne.add(sectionTwo);
ChapterOne.add(sectionThree);

ChapterTwo.add(sectionOne);
ChapterTwo.add(sectionTwo)

ChapterThree.add(sectionOne);
ChapterThree.add(sectionTwo);
ChapterThree.add(sectionThree);
ChapterThree.add(sectionFour);
ChapterThree.remove(sectionFour);


ChapterOne.display();
ChapterTwo.display();
ChapterThree.display();
