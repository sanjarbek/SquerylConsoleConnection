import org.squeryl.adapters.PostgreSqlAdapter
import org.squeryl.{Session, SessionFactory}

object Main extends App {
  Class.forName("org.postgresql.Driver")
  SessionFactory.concreteFactory = Some(()=>
    Session.create(
      java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/complaence", "postgres", "test12"),
      new PostgreSqlAdapter))
}