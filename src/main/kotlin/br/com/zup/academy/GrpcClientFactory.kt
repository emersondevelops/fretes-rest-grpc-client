package br.com.zup.academy

import io.grpc.ManagedChannel
import io.micronaut.context.annotation.Factory
import io.micronaut.grpc.annotation.GrpcChannel
import javax.inject.Singleton

@Factory
class GrpcClientFactory {

    @Singleton
    fun fretesClientStub(
        @GrpcChannel("fretes") channel: ManagedChannel
    ): GrpcFretesServiceGrpc.GrpcFretesServiceBlockingStub? {
        return GrpcFretesServiceGrpc.newBlockingStub(channel)
    }
}