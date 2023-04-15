.PHONY: pullSchema

pullSchema:
	./gradlew :downloadApolloSchema --endpoint='https://api.shopemaa.com/query' --schema=src/main/graphql/schema.graphqls
