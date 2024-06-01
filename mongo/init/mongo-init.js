db.createUser({
  user: "springuser",
  pwd: "springpass",
  roles: [{role: "readWrite", db: "mydatabase"}]
});