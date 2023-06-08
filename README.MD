## Introduction to Spring GraphQL with Spring Boot

graphiql url: http://localhost:8080/graphiql
```graphql
mutation {
  alias:addBook(book: {title: "spring cloud in action", publisher: "new pub", authorId:2}) {id}
  alias2:addBook(book: {title: "spring cloud in action second edition", authorId:2}) {id}
}

query {
  authorById(id: 1) {
    name
  }

  authors {
    id
    name
    age
    books {
      title
      publisher
    }
  }
}
```

curl example
```shell
curl -g \
-X POST \                                   
-H "Content-Type: application/json" \
-d '{"query":"query {authors {id name age books {title publisher} }}"}' \
http://localhost:8080/graphql
```

Source https://www.youtube.com/watch?v=atA2OovQBic
