import VEHICLES_QUERY from "../query/vehicle.query"

const findVehicle = (connection, params) => {
    connection.mysql.query(
        VEHICLES_QUERY.GET_VEHICLE_BY_ID, [params.id],
        function onResult(err, result) {
            return err || result
        }
    )
}

export default findVehicle;