package trab6;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.UpdateResult;
import com.mongodb.client.result.DeleteResult;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.set;
import com.mongodb.client.FindIterable;
import com.mongodb.MongoException;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;


public class DBConnector {
	
	private MongoClient mongoClient;
	private MongoDatabase database;
	    
	    public void connect() {
	        try {
	            mongoClient = MongoClients.create("mongodb://localhost:27017");
	            System.out.println("Connected to the MongoDB server");
	            database = mongoClient.getDatabase("trabalho6");        
	        } catch (MongoException ex) {
	            System.err.println("Error connecting to MongoDB: " + ex.getMessage());
	        }
	    }
	    
	    public void disconnect() {
	        if (mongoClient != null) {
	            mongoClient.close();
	            System.out.println("Disconnected from the MongoDB server");
	        }
	    }
	    
	    public void listProducts(String collectionName) {
	        MongoCollection<Document> collection = database.getCollection(collectionName);
	        FindIterable<Document> iterable = collection.find();
	        MongoCursor<Document> cursor = iterable.iterator();
	        while (cursor.hasNext()) {
	            System.out.println(cursor.next().toJson());
	        }
	        cursor.close();
	    }
	    
	    public void insertProduct(String collectionName, int idProduto, String nome, String descricao, double valor, String estado) {
            MongoCollection<Document> collection = database.getCollection(collectionName);
            Document product = new Document("_id", new ObjectId());
            product.append("idProduto", idProduto)
                   .append("nome", nome)
                   .append("descricao", descricao)
                   .append("valor", valor)
                   .append("estado", estado);
            collection.insertOne(product);
            System.out.println("Added document");
        }
	    
	    public void changeProductValue(String collectionName, int idProduto, double novoValor) {
	    	MongoCollection<Document> collection = database.getCollection(collectionName);
            Bson filter = eq("idProduto", idProduto);
            Bson updateOperation = set("valor", novoValor);
            try {
		        UpdateResult result = collection.updateOne(filter, updateOperation);
		        System.out.println("Updated document count: " + result.getModifiedCount());
            } catch (MongoException ex) {
                System.err.println("Unable to update due to an error: " + ex);
            }
	    }
	    
	    public void deleteProduct(String collectionName, int idProduto) {
    		MongoCollection<Document> collection = database.getCollection(collectionName);
    		Bson filter = eq("idProduto", idProduto);
            try {
                DeleteResult result = collection.deleteOne(filter);
                System.out.println("Deleted document count: " + result.getDeletedCount());
            } catch (MongoException ex) {
                System.err.println("Unable to delete due to an error: " + ex);
            }
        }
   
   	    	    
	    public static void main(String[] args) {
	    	
	        DBConnector connector = new DBConnector();
	        
	        //Conecta no banco
	        connector.connect(); 
	        
	        //Seleciona a coleção Produtos
	        String collectionName = "Produtos"; 
	        
	        //Lista os produtos
	        connector.listProducts(collectionName); 
	        
	        //Adiciona o produto 7 
	        connector.insertProduct(collectionName, 7, "Prod7", "Bla bla", 100.00, "Bla bla"); 
	        
	        //Lista os produtos
	        connector.listProducts(collectionName); 
	        
	        //Altera o valor de um produto
	        connector.changeProductValue(collectionName, 6, 1500.00); 
	        
	        //Lista os produtos
	        connector.listProducts(collectionName); 
	        
	        //Deleta o produto 7
	        connector.deleteProduct(collectionName, 7);
	        
	        //Lista os produtos
	        connector.listProducts(collectionName); 
	        
	        //Desconecta do banco 	              
	        connector.disconnect(); 
	    }
}
