import "frida-il2cpp-bridge";

async function main(){
  try{
    await Il2Cpp.initialize();
    console.log('[+] Il2Cpp initialized. App:', Il2Cpp.application.name);
  }catch(e){
    console.log('an init error has occured', e);
  }
}
main();
