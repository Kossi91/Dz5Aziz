package com.company;

public class Boss {
    private int bossHealth;
    private int bossDamage;
    private String bossProtectionType;

    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public String getBossProtectionType() {
        return bossProtectionType;
    }

    public void setBossProtectionType(String bossProtectionType) {
        this.bossProtectionType = bossProtectionType;
    }
}
