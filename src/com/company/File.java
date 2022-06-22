package com.company;

public class File { // File to save text
    String text;
    String name;
    String path;
    String extension;
    String date;
    String time;
    String size;
    String type;
    String owner;
    String group;
    String permissions;
    String attributes;
    String other;
    String description;
    String hash;
    String hashType;
    String hashDate;
    String hashTime;
    String hashSize;


    public File(String text) {
        this.text = text;
    }


    //-------------------------- SETTERS --------------------------------------

    public void setName(String name) {
        this.name = name;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public void setHashType(String hashType) {
        this.hashType = hashType;
    }

    public void setHashDate(String hashDate) {
        this.hashDate = hashDate;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setHashTime(String hashTime) {
        this.hashTime = hashTime;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setHashSize(String hashSize) {
        this.hashSize = hashSize;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setType(String type) {
        this.type = type;
    }

    //-------------------------- GETTERS --------------------------------------

    public String getName() {
        return name;
    }

    public String getAttributes() {
        return attributes;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getExtension() {
        return extension;
    }

    public String getGroup() {
        return group;
    }

    public String getHash() {
        return hash;
    }

    public String getHashDate() {
        return hashDate;
    }

    public String getHashType() {
        return hashType;
    }

    public String getHashSize() {
        return hashSize;
    }

    public String getHashTime() {
        return hashTime;
    }

    public String getOther() {
        return other;
    }

    public String getOwner() {
        return owner;
    }

    public String getPath() {
        return path;
    }

    public String getPermissions() {
        return permissions;
    }

    public String getSize() {
        return size;
    }

    public String getText() {
        return text;
    }

    public String getTime() {
        return time;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "File{" +
                "text='" + text + '\'' +
                ", name='" + name + '\'' +
                ", path='" + path + '\'' +
                ", extension='" + extension + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", size='" + size + '\'' +
                ", type='" + type + '\'' +
                ", owner='" + owner + '\'' +
                ", group='" + group + '\'' +
                ", permissions='" + permissions + '\'' +
                ", attributes='" + attributes + '\'' +
                ", other='" + other + '\'' +
                ", description='" + description + '\'' +
                ", hash='" + hash + '\'' +
                ", hashType='" + hashType + '\'' +
                ", hashDate='" + hashDate + '\'' +
                ", hashTime='" + hashTime + '\'' +
                ", hashSize='" + hashSize + '\'' +
                '}';
    }
}
