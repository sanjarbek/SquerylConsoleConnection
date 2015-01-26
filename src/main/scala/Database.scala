package models

import org.squeryl.{Table, Schema}
import org.squeryl.PrimitiveTypeMode._

object Database extends Schema {
  val paymentsTable: Table[Payment] = table[Payment]("payments")
  val cashierOperationsTable: Table[CashierOperation] = table[CashierOperation]("cashier_operations")

  on(paymentsTable) {
    payment => declare { payment.id is (autoIncremented("payments_id_seq"))}
  }

  on(cashierOperationsTable) {
    operation => declare { operation.id is (autoIncremented("cashier_operations_id_seq"))}
  }

}
