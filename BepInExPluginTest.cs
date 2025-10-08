# WORK IN PROGRESS
# I WILL BE TESTING THIS LATER
using BepInEx;
using UnityEngine;

[BepInPlugin("com.you.vrtest","VR Test Mod","0.1.0")]
public class VRTestMod : BaseUnityPlugin
{
    void Awake() { Logger.LogInfo("VRTestMod loaded"); }
    void Update()
    {
        if (Input.GetKeyDown(KeyCode.K)) {
            Debug.Log("Player pos: " + Camera.main.transform.position);
        }
    }
}
