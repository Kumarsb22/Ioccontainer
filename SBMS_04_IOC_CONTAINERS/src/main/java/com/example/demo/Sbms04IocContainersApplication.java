package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Sbms04IocContainersApplication {

	public static void main(String[] args) {
//		ConfigurableApplicationContext context = SpringApplication.run(Sbms04IocContainersApplication.class, args);
//		System.out.println(context.getBeanDefinitionCount());
//
//		String[] beanDefinitionNames = context.getBeanDefinitionNames();
//
//		for (String string : beanDefinitionNames) {
//			System.out.println(string);
//		}
//		
//		59
//		org.springframework.context.annotation.internalConfigurationAnnotationProcessor
//		org.springframework.context.annotation.internalAutowiredAnnotationProcessor
//		org.springframework.context.annotation.internalCommonAnnotationProcessor
//		org.springframework.context.event.internalEventListenerProcessor
//		org.springframework.context.event.internalEventListenerFactory
//		sbms04IocContainersApplication
//		org.springframework.boot.autoconfigure.internalCachingMetadataReaderFactory
//		org.springframework.boot.autoconfigure.AutoConfigurationPackages
//		org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration
//		propertySourcesPlaceholderConfigurer
//		org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration
//		mbeanExporter
//		objectNamingStrategy
//		mbeanServer
//		org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor
//		org.springframework.boot.context.internalConfigurationPropertiesBinder
//		org.springframework.boot.context.properties.BoundConfigurationProperties
//		org.springframework.boot.context.properties.EnableConfigurationPropertiesRegistrar.methodValidationExcludeFilter
//		spring.jmx-org.springframework.boot.autoconfigure.jmx.JmxProperties
//		org.springframework.boot.autoconfigure.admin.SpringApplicationAdminJmxAutoConfiguration
//		springApplicationAdminRegistrar
//		org.springframework.boot.autoconfigure.aop.AopAutoConfiguration$ClassProxyingConfiguration
//		forceAutoProxyCreatorToUseClassProxying
//		org.springframework.boot.autoconfigure.aop.AopAutoConfiguration
//		org.springframework.boot.autoconfigure.availability.ApplicationAvailabilityAutoConfiguration
//		applicationAvailability
//		org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration
//		org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration
//		lifecycleProcessor
//		spring.lifecycle-org.springframework.boot.autoconfigure.context.LifecycleProperties
//		org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration
//		spring.info-org.springframework.boot.autoconfigure.info.ProjectInfoProperties
//		org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration
//		spring.sql.init-org.springframework.boot.autoconfigure.sql.init.SqlInitializationProperties
//		org.springframework.boot.sql.init.dependency.DatabaseInitializationDependencyConfigurer$DependsOnDatabaseInitializationPostProcessor
//		org.springframework.boot.autoconfigure.ssl.SslAutoConfiguration
//		fileWatcher
//		sslPropertiesSslBundleRegistrar
//		sslBundleRegistry
//		spring.ssl-org.springframework.boot.autoconfigure.ssl.SslProperties
//		org.springframework.boot.autoconfigure.task.TaskExecutorConfigurations$ThreadPoolTaskExecutorBuilderConfiguration
//		threadPoolTaskExecutorBuilder
//		org.springframework.boot.autoconfigure.task.TaskExecutorConfigurations$TaskExecutorBuilderConfiguration
//		taskExecutorBuilder
//		org.springframework.boot.autoconfigure.task.TaskExecutorConfigurations$SimpleAsyncTaskExecutorBuilderConfiguration
//		simpleAsyncTaskExecutorBuilder
//		org.springframework.boot.autoconfigure.task.TaskExecutorConfigurations$TaskExecutorConfiguration
//		applicationTaskExecutor
//		org.springframework.boot.autoconfigure.task.TaskExecutionAutoConfiguration
//		spring.task.execution-org.springframework.boot.autoconfigure.task.TaskExecutionProperties
//		org.springframework.boot.autoconfigure.task.TaskSchedulingConfigurations$ThreadPoolTaskSchedulerBuilderConfiguration
//		threadPoolTaskSchedulerBuilder
//		org.springframework.boot.autoconfigure.task.TaskSchedulingConfigurations$TaskSchedulerBuilderConfiguration
//		taskSchedulerBuilder
//		org.springframework.boot.autoconfigure.task.TaskSchedulingConfigurations$SimpleAsyncTaskSchedulerBuilderConfiguration
//		simpleAsyncTaskSchedulerBuilder
//		org.springframework.boot.autoconfigure.task.TaskSchedulingAutoConfiguration
//		spring.task.scheduling-org.springframework.boot.autoconfigure.task.TaskSchedulingProperties
//		org.springframework.aop.config.internalAutoProxyCreator

		ConfigurableApplicationContext run = SpringApplication.run(Sbms04IocContainersApplication.class, args);
		System.out.println("hello");
		System.out.println(run.getBeanDefinitionCount());
		System.out.println(run.getClass().getName());

//		String[] beanDefinitionNames = run.getBeanDefinitionNames();
//		for (String string : beanDefinitionNames) {
//			System.out.println(string);
//		}

	}

}
