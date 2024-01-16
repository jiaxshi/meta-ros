# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Support for transporting PointCloud2 messages in compressed format and plugin interface for implementing additional PointCloud2 transports."
AUTHOR = "Alejandro Hernández <alejandro@openrobotics.org>"
ROS_AUTHOR = "Jakub Paplham"
HOMEPAGE = "https://github.com/ros-perception/point_cloud_transport"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "point_cloud_transport"
ROS_BPN = "point_cloud_transport"

ROS_BUILD_DEPENDS = " \
    message-filters \
    pluginlib \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    tl-expected \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = " \
    message-filters \
    pluginlib \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    tl-expected \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    message-filters \
    pluginlib \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    tl-expected \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-copyright \
    ament-cmake-cppcheck \
    ament-cmake-cpplint \
    ament-cmake-flake8 \
    ament-cmake-gtest \
    ament-cmake-lint-cmake \
    ament-cmake-pep257 \
    ament-cmake-uncrustify \
    ament-cmake-xmllint \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/point_cloud_transport-release/archive/release/humble/point_cloud_transport/1.0.15-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/point_cloud_transport"
SRC_URI = "git://github.com/ros2-gbp/point_cloud_transport-release;${ROS_BRANCH};protocol=https"
SRCREV = "721725be46e55c2d070d82b31f46ef8bee0da86f"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}