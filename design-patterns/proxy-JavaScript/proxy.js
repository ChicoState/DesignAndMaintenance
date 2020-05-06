
function SystemInformation()
{
  this.getPrice = function(part)
  {
    console.log("External Service Call")
    if(part == "Monitor"){
      return "$500"
    }
    if(part == "HardDrive"){
      return "$210"
    }
    else{
      return "Not Found"
    }
  }
}

const sysinfo = new SystemInformation()
console.log("----No Proxy----")
console.log(sysinfo.getPrice("Monitor"))
console.log(sysinfo.getPrice("HardDrive"))
console.log(sysinfo.getPrice("Monitor"))
console.log(sysinfo.getPrice("HardDrive"))

function SystemInformationProxy()
{
  this.sysinfo = new SystemInformation()
  this.cache = {}

  this.getPrice = function(part)
  {
    if(this.cache[part] == null)
    {
      this.cache[part] = this.sysinfo.getPrice(part)
    }
    return this.cache[part]
  }
}

console.log("----With Proxy----")
const proxy = new SystemInformationProxy()
console.log(proxy.getPrice("Monitor"))
console.log(proxy.getPrice("HardDrive"))
console.log(proxy.getPrice("Monitor"))
console.log(proxy.getPrice("HardDrive"))